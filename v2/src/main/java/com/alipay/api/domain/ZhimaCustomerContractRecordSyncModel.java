package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子合约链路存证
 *
 * @author auto create
 * @since 1.0, 2019-06-21 14:07:19
 */
public class ZhimaCustomerContractRecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1699726919791656237L;

	/**
	 * 本次业务流程唯一标识，一次电子合约流程中可能存在多次业务操作，比如有多次电子签名，每次业务操作有一个唯一标识，每次业务操作有多次存证记录
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 存证记录的业务发生时间，为格林威治时间从1970年1月1日0点到现在的毫秒数。Java程序里面通过System.currentTimeMillis()获取
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 存证记录业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 存证记录的电子合约号，标识一次完整的电子合约流程，一次电子合约流程会有多次业务流程，比如有多次电子签名，每个业务流程有多次存证记录
	 */
	@ApiField("contract_no")
	private String contractNo;

	/**
	 * 存证内容，根据biz type不同而不同
	 */
	@ApiField("record_content")
	private String recordContent;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContractNo() {
		return this.contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getRecordContent() {
		return this.recordContent;
	}
	public void setRecordContent(String recordContent) {
		this.recordContent = recordContent;
	}

}
