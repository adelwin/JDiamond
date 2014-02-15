/**
 * File Name    : BaseModel.java
 * Author       : adelwin
 * Created Date : Dec 29, 2010 3:13:29 PM
 */
package org.si.diamond.base.model;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable {

	private static final long serialVersionUID = 6155755814969785686L;
	private String attr1;
	private String attr2;
	private String attr3;
	private String attr4;
	private String createBy;
	private Date createDate;
	private String updateBy;
	private Date updateDate;
	private String status;
	
	/**
	 * @return the attr1
	 */
	public String getAttr1() {
		return attr1;
	}
	/**
	 * @param attr1 the attr1 to set
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	/**
	 * @return the attr2
	 */
	public String getAttr2() {
		return attr2;
	}
	/**
	 * @param attr2 the attr2 to set
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	/**
	 * @return the attr3
	 */
	public String getAttr3() {
		return attr3;
	}
	/**
	 * @param attr3 the attr3 to set
	 */
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	/**
	 * @return the attr4
	 */
	public String getAttr4() {
		return attr4;
	}
	/**
	 * @param attr4 the attr4 to set
	 */
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	/**
	 * @return the createBy
	 */
	public String getCreateBy() {
		return createBy;
	}
	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * @return the updateBy
	 */
	public String getUpdateBy() {
		return updateBy;
	}
	/**
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
