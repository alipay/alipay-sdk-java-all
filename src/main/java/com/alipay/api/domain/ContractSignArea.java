package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子合同签署区配置
 *
 * @author auto create
 * @since 1.0, 2022-09-24 16:10:56
 */
public class ContractSignArea extends AlipayObject {

	private static final long serialVersionUID = 2578972147131862627L;

	/**
	 * 签署区页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * x坐标
	 */
	@ApiField("pos_x")
	private String posX;

	/**
	 * y坐标
	 */
	@ApiField("pos_y")
	private String posY;

	/**
	 * 签署角色类型，个人=USER，企业=COMPANY
	 */
	@ApiField("user_type")
	private String userType;

	/**
	 * 签署区宽度
	 */
	@ApiField("width")
	private String width;

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPosX() {
		return this.posX;
	}
	public void setPosX(String posX) {
		this.posX = posX;
	}

	public String getPosY() {
		return this.posY;
	}
	public void setPosY(String posY) {
		this.posY = posY;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getWidth() {
		return this.width;
	}
	public void setWidth(String width) {
		this.width = width;
	}

}
