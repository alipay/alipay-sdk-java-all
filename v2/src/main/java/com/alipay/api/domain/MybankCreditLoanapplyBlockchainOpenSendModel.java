package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链 机构侧通知发送 / 文件上链
 *
 * @author auto create
 * @since 1.0, 2022-10-28 11:29:01
 */
public class MybankCreditLoanapplyBlockchainOpenSendModel extends AlipayObject {

	private static final long serialVersionUID = 1532759255931874877L;

	/**
	 * 业务类型,NOTICE_SEND_EVENT,机构侧通知发送 ,SDK枚举获取 业务类型,UPLOAD_FILE_FOR_CHAIN_EVENT,文件上链请求,SDK枚举获取 业务类
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 业务字段,暂时不需要，后续可能留不同机构差异性扩展用
	 */
	@ApiField("data_object")
	private String dataObject;

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getDataObject() {
		return this.dataObject;
	}
	public void setDataObject(String dataObject) {
		this.dataObject = dataObject;
	}

}
