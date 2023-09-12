package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot酒店行业isv创建酒店
 *
 * @author auto create
 * @since 1.0, 2023-07-19 19:10:50
 */
public class AlipayOpenIotmbsIsvhotelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8178237463249745277L;

	/**
	 * 酒店关联的appid，后面相应的小程序调用相关组件时用于鉴权,多个appid之间用,分割
	 */
	@ApiField("appid")
	private String appid;

	/**
	 * 酒店所在区县的编码
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 酒店项目所处的详细地址
	 */
	@ApiField("project_addr")
	private String projectAddr;

	/**
	 * 用于标记创建的酒店是否是线上真实项目
	 */
	@ApiField("project_flag")
	private String projectFlag;

	/**
	 * 酒店项目id。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * isv定义的酒店名
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 在蚂蚁门店创建的门店的shopId
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 解决方案的唯一标识
	 */
	@ApiField("solution")
	private String solution;

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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSolution() {
		return this.solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}

}
