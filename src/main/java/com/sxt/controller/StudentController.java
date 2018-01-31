package com.sxt.controller;

import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.sxt.entity.Student;
import com.sxt.service.StudentService;

@Controller
public class StudentController {

	@Resource(name="studentService")
	private StudentService studentService;
	
	@RequestMapping("/register.action")
	public String register(Student student,Model model,MultipartFile photo,HttpSession session) throws Exception{
		//获取服务器上photoes文件夹的绝对路径
		String path = session.getServletContext().getRealPath("/photoes");
		//获取上传文件的名称
		String fileName = photo.getOriginalFilename();
		//构建目标文件
		File destFile = new java.io.File(path, fileName);
		//将获取到的临时图片保存到目标文件中
		photo.transferTo(destFile);
		
		//将图片名称保存到实体类对象的属性上
		student.setStuPhoto(fileName);		
		//调用业务方法
		studentService.addStudent(student);
		
		//保存数据
		model.addAttribute("studnet", student);
		
		return "/page/registerOk.jsp";
	}
	
	@RequestMapping("/download.action")
	public void download(String filename,HttpSession session,HttpServletResponse response) throws Exception{
		//获取服务器上photoes文件夹的绝对路径
	    String path = session.getServletContext().getRealPath("/photoes");
	    //建构源文件
	    File sourceFile = new File(path, filename);
	    //读取文件内容
	    byte[] bytes = FileUtils.readFileToByteArray(sourceFile);
	    
	    //设置响应的结果类型
	    response.setContentType("application/octet-stream");
	    //设置响应头信息
	    response.setHeader("Content-Disposition", "attachment;filename="+filename);
	    
	    //从响应中获取输出流对象
	    OutputStream os = response.getOutputStream();
	    //利用输出流将图片内容发送到客户端
	    os.write(bytes);
	    //关闭流
	    os.close();
	}
		
	@RequestMapping("/searchStudent3.action")
	public @ResponseBody Student searchStudent3(@RequestBody Student stu) throws Exception{
		//调用业务方法时行验证
		Student student = studentService.queryStudent(stu.getStuName());
		if (student == null) {
			student = new Student();
		}
		return student;
	}
}
