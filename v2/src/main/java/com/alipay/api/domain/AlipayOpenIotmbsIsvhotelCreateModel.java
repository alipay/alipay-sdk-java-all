package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot酒店行业isv创建酒店
 *
 * @author auto create
 * @since 1.0, 2023-03-06 14:43:49
 */
public class AlipayOpenIotmbsIsvhotelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5519687212778542298L;

	/**
	 * appid+酒店关联的appid，后面相应的小程序调用相关组件时用于鉴权,多个appid之间用,分割
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * area_code:酒店所在区县的编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * project_addr+酒店项目所处的详细地址
	 */
	@ApiField("project_addr")
	private String projectAddr;

	/**
	 * project_flag用于标记创建的酒店是否是线上真实项目
	 */
	@ApiField("project_flag")
	private String projectFlag;

	/**
	 * project_id，酒店项目id。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * project_name+isv定义的酒店名
	 */
	@ApiField("project_name")
	private String projectName;

	public String getAppid() {
		return this.appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getProjectAddr() {
		return this.projectAddr;
	}
	public void setProjectAddr(String projectAddr) {
		this.projectAddr = projectAddr;
	}

	public String getProjectFlag() {
		return this.projectFlag;
	}
	public void setProjectFlag(String projectFlag) {
		this.projectFlag = projectFlag;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
