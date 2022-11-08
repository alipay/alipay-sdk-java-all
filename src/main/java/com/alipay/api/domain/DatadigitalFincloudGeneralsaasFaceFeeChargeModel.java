package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸认证产品计费
 *
 * @author auto create
 * @since 1.0, 2022-05-26 20:43:01
 */
public class DatadigitalFincloudGeneralsaasFaceFeeChargeModel extends AlipayObject {

	private static final long serialVersionUID = 2149149596295631315L;

	/**
	 * 云上人脸服务生成的单据号
	 */
	@ApiField("certify_no")
	private String certifyNo;

	/**
	 * 开放平台上入驻的商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 云上核身的产品码
	 */
	@ApiField("product")
	private String product;

	/**
	 * 该字段废弃不用。
	 */
	@ApiField("product_code")
	private Date productCode;

	/**
	 * 人脸服务中定义的场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 单据完成服务时间
	 */
	@ApiField("service_time")
	private Date serviceTime;

	public String getCertifyNo() {
		return this.certifyNo;
	}
	public void setCertifyNo(String certifyNo) {
		this.certifyNo = certifyNo;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public Date getProductCode() {
		return this.productCode;
	}
	public void setProductCode(Date productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Date getServiceTime() {
		return this.serviceTime;
	}
	public void setServiceTime(Date serviceTime) {
		this.serviceTime = serviceTime;
	}

}
