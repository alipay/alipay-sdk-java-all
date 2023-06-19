package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业信用征信授权数据查询任务创建
 *
 * @author auto create
 * @since 1.0, 2023-03-17 12:49:34
 */
public class ZhimaCreditEpCreditlinkCollectCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5669554497818199528L;

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
	 * 商户单号，请与授权申请时的单号保持一致
	 */
	@ApiField("merchant_request_id")
	private String merchantRequestId;

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

}
