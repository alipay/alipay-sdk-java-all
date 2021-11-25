package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商业订单咨询
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:36:35
 */
public class AlipayBusinessOrderConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4494969474855319328L;

	/**
	 * 买家识别信息。
本接口场景下若无用户id信息，可扫用户付款页中条形码，传入条码信息（type为BAR_CODE，issuer为ALIPAY，identity为获取的用户条形码码值）
	 */
	@ApiField("buyer_identity")
	private UserIdentity buyerIdentity;

	/**
	 * 经营环境信息
	 */
	@ApiField("env_info")
	private EnvInfo envInfo;

	/**
	 * 商品详情列表
	 */
	@ApiListField("item_list")
	@ApiField("item_detail")
	private List<ItemDetail> itemList;

	public UserIdentity getBuyerIdentity() {
		return this.buyerIdentity;
	}
	public void setBuyerIdentity(UserIdentity buyerIdentity) {
		this.buyerIdentity = buyerIdentity;
	}

	public EnvInfo getEnvInfo() {
		return this.envInfo;
	}
	public void setEnvInfo(EnvInfo envInfo) {
		this.envInfo = envInfo;
	}

	public List<ItemDetail> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ItemDetail> itemList) {
		this.itemList = itemList;
	}

}
