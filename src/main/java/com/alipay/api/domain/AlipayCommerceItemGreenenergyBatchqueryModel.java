package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业绿色能量插件能量流水查询
 *
 * @author auto create
 * @since 1.0, 2022-11-07 14:51:09
 */
public class AlipayCommerceItemGreenenergyBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1461123238581614867L;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝用户uid
	 */
	@ApiField("alipay_uid")
	private String alipayUid;

	/**
	 * 绿色能量发放归属的商户信息。
说明：
如果该复杂对象不填。则默认为该绿色能量发放的归属者是调用者本人。
如果填写，则认为该绿色能量发放的归属者是该商户。
限制:服务商身份接入时必传
	 */
	@ApiField("belong_merchant_info")
	private BelongGreenMerchantInfo belongMerchantInfo;

	/**
	 * 能量状态： 0.待领取；1.已领取. 默认返回所有记录
	 */
	@ApiField("energy_status")
	private Long energyStatus;

	/**
	 * 分页器
	 */
	@ApiField("paginator")
	private GreenPaginator paginator;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUid() {
		return this.alipayUid;
	}
	public void setAlipayUid(String alipayUid) {
		this.alipayUid = alipayUid;
	}

	public BelongGreenMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(BelongGreenMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public Long getEnergyStatus() {
		return this.energyStatus;
	}
	public void setEnergyStatus(Long energyStatus) {
		this.energyStatus = energyStatus;
	}

	public GreenPaginator getPaginator() {
		return this.paginator;
	}
	public void setPaginator(GreenPaginator paginator) {
		this.paginator = paginator;
	}

}
