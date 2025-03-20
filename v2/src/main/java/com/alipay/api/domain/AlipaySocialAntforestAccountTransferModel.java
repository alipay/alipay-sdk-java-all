package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 森林能量转移接口
 *
 * @author auto create
 * @since 1.0, 2024-03-14 19:28:21
 */
public class AlipaySocialAntforestAccountTransferModel extends AlipayObject {

	private static final long serialVersionUID = 3812745658325385862L;

	/**
	 * 用户在森林里的账户id，转移能量的源头账户（可以是user_id相同）
	 */
	@ApiField("energy_account_from")
	private String energyAccountFrom;

	/**
	 * 能量转移的目标账户
	 */
	@ApiField("energy_account_to")
	private String energyAccountTo;

	/**
	 * 转移出去的能量值
	 */
	@ApiField("energy_count")
	private Long energyCount;

	/**
	 * 扩展字段，用于不同业务之间的数据扩展
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 蚂蚁统一会员ID，执行该操作的支付宝用户
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * USER_TO_ACCOUNT： 内部户->外部户转移，钉钉用这个类型
	 */
	@ApiField("transfer_type")
	private String transferType;

	/**
	 * 蚂蚁统一会员ID，执行该操作的支付宝用户
	 */
	@ApiField("user_id")
	private String userId;

	public String getEnergyAccountFrom() {
		return this.energyAccountFrom;
	}
	public void setEnergyAccountFrom(String energyAccountFrom) {
		this.energyAccountFrom = energyAccountFrom;
	}

	public String getEnergyAccountTo() {
		return this.energyAccountTo;
	}
	public void setEnergyAccountTo(String energyAccountTo) {
		this.energyAccountTo = energyAccountTo;
	}

	public Long getEnergyCount() {
		return this.energyCount;
	}
	public void setEnergyCount(Long energyCount) {
		this.energyCount = energyCount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTransferType() {
		return this.transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
