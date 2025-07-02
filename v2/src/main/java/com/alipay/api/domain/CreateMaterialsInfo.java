package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建物料信息
 *
 * @author auto create
 * @since 1.0, 2024-09-11 09:52:58
 */
public class CreateMaterialsInfo extends AlipayObject {

	private static final long serialVersionUID = 1261334186281913945L;

	/**
	 * 桌号
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 该二维码需要的物料数量，单位个
	 */
	@ApiField("num")
	private Long num;

	/**
	 * 用于描述物料的生产要素信息
	 */
	@ApiField("production_ext_info")
	private String productionExtInfo;

	/**
	 * 二维码地址链接
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public Long getNum() {
		return this.num;
	}
	public void setNum(Long num) {
		this.num = num;
	}

	public String getProductionExtInfo() {
		return this.productionExtInfo;
	}
	public void setProductionExtInfo(String productionExtInfo) {
		this.productionExtInfo = productionExtInfo;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

}
