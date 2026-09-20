package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下单物料的生产资料信息
 *
 * @author auto create
 * @since 1.0, 2026-08-25 10:12:51
 */
public class ProductionMaterial extends AlipayObject {

	private static final long serialVersionUID = 1111813939757339642L;

	/**
	 * 碰一下跳转页面链接
	 */
	@ApiField("coil_link_url")
	private String coilLinkUrl;

	/**
	 * 物料上的桌号/序号信息
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 点位名称
	 */
	@ApiField("position_name")
	private String positionName;

	/**
	 * 二维码链接
	 */
	@ApiField("print_qr_code_url")
	private String printQrCodeUrl;

	/**
	 * 扩展信息
	 */
	@ApiField("variable_ext_tr_info")
	private String variableExtTrInfo;

	public String getCoilLinkUrl() {
		return this.coilLinkUrl;
	}
	public void setCoilLinkUrl(String coilLinkUrl) {
		this.coilLinkUrl = coilLinkUrl;
	}

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public String getPositionName() {
		return this.positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getPrintQrCodeUrl() {
		return this.printQrCodeUrl;
	}
	public void setPrintQrCodeUrl(String printQrCodeUrl) {
		this.printQrCodeUrl = printQrCodeUrl;
	}

	public String getVariableExtTrInfo() {
		return this.variableExtTrInfo;
	}
	public void setVariableExtTrInfo(String variableExtTrInfo) {
		this.variableExtTrInfo = variableExtTrInfo;
	}

}
