package com.vshcxl.common.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

//@XmlRootElement(name="department") 
@XStreamAlias("department")
public class Department {
//	@XStreamAlias("name")
	private String name;    //部门名称
//	@XStreamAlias("staffs")
	// 隐式集合，加上这个注解可以去掉book集合最外面的<list></list>这样的标记
    @XStreamImplicit
    private List<Staff> staffs;           // 其实staff是单复同型，这里是加's'是为了区别staff  
      
    public String getName() {  
        return name;  
    }  
//    @XmlAttribute  
    public void setName(String name) {  
        this.name = name;  
    }  
    public List<Staff> getStaffs() {  
        return staffs;  
    }  
//    @XmlElement(name="staff")  
    public void setStaffs(List<Staff> staffs) {  
        this.staffs = staffs;  
    }  
}
