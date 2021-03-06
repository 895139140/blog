package cn.nf.zsx.blog.domin;

import java.io.Serializable;


/**
 * 
 * @Description 博客类别实体类
 */
@SuppressWarnings("serial")
public class BlogType implements Serializable{

	/**
	 * 
	 */
	private Integer id;
	private String typeName;
	private Integer orderNum;
	private Integer blogCount; // 数量

	public BlogType(Integer id, String typeName, Integer orderNum) {
		this.id = id;
		this.typeName = typeName;
		this.orderNum = orderNum;
	}

	public BlogType() {
	}

	public BlogType(String typeName, Integer orderNum) {
		this.typeName = typeName;
		this.orderNum = orderNum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "BlogType{" + "id=" + id + ", typeName='" + typeName + '\''
				+ ", orderNum=" + orderNum + '}';
	}

	public Integer getBlogCount() {
		return blogCount;
	}

	public void setBlogCount(Integer blogCount) {
		this.blogCount = blogCount;
	}
}