package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * lbs人群创建
 *
 * @author auto create
 * @since 1.0, 2023-08-11 13:57:17
 */
public class AlipayMerchantQipanLbscrowdCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1712618174451789216L;

	/**
	 * 安全应用范围，参考文档<a href="https://opendocs.alipay.com/pre-open/04phhq" target="_blank">安全应用范围枚举</a>
<br>
未传值或传入渠道均非法时 采用默认渠道，默认渠道：支付结果页AA、繁星激励。
<br>
传入值时，以商户入参为准。
	 */
	@ApiListField("apply_channel_list")
	@ApiField("string")
	private List<String> applyChannelList;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 门店范围 单位（米）
	 */
	@ApiField("shop_distance")
	private Long shopDistance;

	/**
	 * 门店id列表
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	public List<String> getApplyChannelList() {
		return this.applyChannelList;
	}
	public void setApplyChannelList(List<String> applyChannelList) {
		this.applyChannelList = applyChannelList;
	}

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public Long getShopDistance() {
		return this.shopDistance;
	}
	public void setShopDistance(Long shopDistance) {
		this.shopDistance = shopDistance;
	}

	public List<String> getShopIdList() {
		return this.shopIdList;
	}
	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

}
