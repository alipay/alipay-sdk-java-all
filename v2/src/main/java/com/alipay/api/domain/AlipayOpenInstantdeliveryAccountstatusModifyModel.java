package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * testhaha
 *
 * @author auto create
 * @since 1.0, 2022-09-14 20:29:31
 */
public class AlipayOpenInstantdeliveryAccountstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6751432819543927332L;

	/**
	 * 要更新的商家账户列表
	 */
	@ApiListField("logistics_account_infos")
	@ApiField("logistics_account_info")
	private List<LogisticsAccountInfo> logisticsAccountInfos;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public List<LogisticsAccountInfo> getLogisticsAccountInfos() {
		return this.logisticsAccountInfos;
	}
	public void setLogisticsAccountInfos(List<LogisticsAccountInfo> logisticsAccountInfos) {
		this.logisticsAccountInfos = logisticsAccountInfos;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
