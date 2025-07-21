package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用征信授权数据查询任务创建
 *
 * @author auto create
 * @since 1.0, 2023-07-17 11:26:52
 */
public class ZhimaCreditEpCreditlinkCollectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5486511415193548119L;

	/**
	 * 查询任务创建信息
	 */
	@ApiField("create_info")
	private String createInfo;

	/**
	 * 请求数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 企业的社会统一信用代码或营业执照注册号
	 */
	@ApiField("ep_cert_no")
	private String epCertNo;

	/**
	 * 企业名称
	 */
	@ApiField("ep_name")
	private String epName;

	/**
	 * 拓展信息
	 */
	@ApiField("ext_info")
	private CreateExtInfo extInfo;

	/**
	 * 商户单号，商户需保证其唯一性
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getCreateInfo() {
		return this.createInfo;
	}
	public void setCreateInfo(String createInfo) {
		this.createInfo = createInfo;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getEpCertNo() {
		return this.epCertNo;
	}
	public void setEpCertNo(String epCertNo) {
		this.epCertNo = epCertNo;
	}

	public String getEpName() {
		return this.epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}

	public CreateExtInfo getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(CreateExtInfo extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantRequestId() {
		return this.merchantRequestId;
	}
	public void setMerchantRequestId(String merchantRequestId) {
		this.merchantRequestId = merchantRequestId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
