package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店码开通流水信息
 *
 * @author auto create
 * @since 1.0, 2020-10-21 17:01:14
 */
public class OrderInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6534793319512656796L;

	/**
	 * 支付宝平台接收开通门店码请求后分配的流水编号
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 流水创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 服务商操作人ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 外部业务流水号，由服务商生成，作为请求的外部主键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 商户PID，本次开通门店码的商家PID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 外部业务流水号，由服务商生成，作为请求的外部主键。(已废弃，建议使用out_biz_no字段)
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 开通结果状态码，具体如下：
WAIT_MERCHANT_CONFIRM - 等待商户确认；
AUDIT_PASSED - 审核通过；
AUDIT_FAILED - 审核不通过；
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 开通结果状态描述，对应result_code状态码字段，如下：
WAIT_MERCHANT_CONFIRM - 等待商户确认；
AUDIT_PASSED - 审核通过；
AUDIT_FAILED - 审核不通过；
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/**
	 * 支付宝门店ID，门店进件后生成
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 开通状态，状态码如下：
- NOT_OPEN  未开通
- OPENING  开通中
- OPENED  已开通
	 */
	@ApiField("status")
	private String status;

	/**
	 * 门店开通码子状态，仅在开通中状态(OPENING)才有子状态分类：
- WAIT_CONFIRM  待商家确认
- AUDIT_SUBMITTED  商家已确认，平台审核中
- AUDIT_PASSED  审核通过
- AUDIT_FAILED  审核失败
	 */
	@ApiField("sub_status")
	private String subStatus;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return this.resultDesc;
	}
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

}
