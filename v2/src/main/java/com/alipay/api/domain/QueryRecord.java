package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签约记录信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 01:23:09
 */
public class QueryRecord extends AlipayObject {

	private static final long serialVersionUID = 2284611466384162368L;

	/**
	 * 区块在账本中的数据地址
	 */
	@ApiField("block_addr")
	private String blockAddr;

	/**
	 * 上链内容所在区块高度
	 */
	@ApiField("block_height")
	private String blockHeight;

	/**
	 * 企业编号
	 */
	@ApiField("corp_code")
	private String corpCode;

	/**
	 * 企业名称
	 */
	@ApiField("corp_name")
	private String corpName;

	/**
	 * 上链状态

SYNCHING：上链中；SYNCHED：上链完成
	 */
	@ApiField("notary_status")
	private String notaryStatus;

	/**
	 * 操作人(经办人/实际签约人)姓名
	 */
	@ApiField("opr_cert_name")
	private String oprCertName;

	/**
	 * 拒绝原因
	 */
	@ApiField("refuse_reason")
	private String refuseReason;

	/**
	 * 签约顺序(0:  初始发起签约;   1：第1方签约;  2：第2方签约)
	 */
	@ApiField("sign_order")
	private Long signOrder;

	/**
	 * 签约时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 操作类型英文code(INIT: 发起签约;  CANCEL: 撤销签约;  APPROVE: 确认签约)
	 */
	@ApiField("sign_type_code")
	private String signTypeCode;

	/**
	 * 上链时间
	 */
	@ApiField("syn_time")
	private Date synTime;

	/**
	 * 签约步骤上链哈希值
	 */
	@ApiField("tx_hash_code")
	private String txHashCode;

	public String getBlockAddr() {
		return this.blockAddr;
	}
	public void setBlockAddr(String blockAddr) {
		this.blockAddr = blockAddr;
	}

	public String getBlockHeight() {
		return this.blockHeight;
	}
	public void setBlockHeight(String blockHeight) {
		this.blockHeight = blockHeight;
	}

	public String getCorpCode() {
		return this.corpCode;
	}
	public void setCorpCode(String corpCode) {
		this.corpCode = corpCode;
	}

	public String getCorpName() {
		return this.corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getNotaryStatus() {
		return this.notaryStatus;
	}
	public void setNotaryStatus(String notaryStatus) {
		this.notaryStatus = notaryStatus;
	}

	public String getOprCertName() {
		return this.oprCertName;
	}
	public void setOprCertName(String oprCertName) {
		this.oprCertName = oprCertName;
	}

	public String getRefuseReason() {
		return this.refuseReason;
	}
	public void setRefuseReason(String refuseReason) {
		this.refuseReason = refuseReason;
	}

	public Long getSignOrder() {
		return this.signOrder;
	}
	public void setSignOrder(Long signOrder) {
		this.signOrder = signOrder;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getSignTypeCode() {
		return this.signTypeCode;
	}
	public void setSignTypeCode(String signTypeCode) {
		this.signTypeCode = signTypeCode;
	}

	public Date getSynTime() {
		return this.synTime;
	}
	public void setSynTime(Date synTime) {
		this.synTime = synTime;
	}

	public String getTxHashCode() {
		return this.txHashCode;
	}
	public void setTxHashCode(String txHashCode) {
		this.txHashCode = txHashCode;
	}

}
