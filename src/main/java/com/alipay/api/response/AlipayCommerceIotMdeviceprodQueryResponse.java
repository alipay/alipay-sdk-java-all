package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MerchantModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-04-11 17:05:00
 */
public class AlipayCommerceIotMdeviceprodQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7633179414181766312L;

	/** 
	 * 设备激活时间
	 */
	@ApiField("activate_time")
	private Date activateTime;

	/** 
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 机具名称
	 */
	@ApiField("device_name")
	private String deviceName;

	/** 
	 * 机具图片信息
	 */
	@ApiField("img_url")
	private String imgUrl;

	/** 
	 * isv信息
	 */
	@ApiField("isv")
	private MerchantModel isv;

	/** 
	 * 商户联系信息
	 */
	@ApiField("merchant")
	private MerchantModel merchant;

	/** 
	 * 机具状态code
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 设备状态描述
	 */
	@ApiField("status_desc")
	private String statusDesc;

	/** 
	 * 机具生产厂商
	 */
	@ApiField("supplier_name")
	private String supplierName;

	public void setActivateTime(Date activateTime) {
		this.activateTime = activateTime;
	}
	public Date getActivateTime( ) {
		return this.activateTime;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceName( ) {
		return this.deviceName;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgUrl( ) {
		return this.imgUrl;
	}

	public void setIsv(MerchantModel isv) {
		this.isv = isv;
	}
	public MerchantModel getIsv( ) {
		return this.isv;
	}

	public void setMerchant(MerchantModel merchant) {
		this.merchant = merchant;
	}
	public MerchantModel getMerchant( ) {
		return this.merchant;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getStatusDesc( ) {
		return this.statusDesc;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierName( ) {
		return this.supplierName;
	}

}
