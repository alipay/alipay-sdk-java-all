package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 票据平台异常订单开票接口
 *
 * @author auto create
 * @since 1.0, 2020-12-16 11:59:21
 */
public class AlipayFundTransInvoiceResubmitModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6127482234545791426L;

	/**
	 * 业务ID
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 是否是区块链数据 1 是区块链 0 非区块链
	 */
	@ApiField("is_block")
	private String isBlock;

	/**
	 * 用户标识
	 */
	@ApiField("uid_range")
	private String uidRange;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getIsBlock() {
		return this.isBlock;
	}
	public void setIsBlock(String isBlock) {
		this.isBlock = isBlock;
	}

	public String getUidRange() {
		return this.uidRange;
	}
	public void setUidRange(String uidRange) {
		this.uidRange = uidRange;
	}

}
