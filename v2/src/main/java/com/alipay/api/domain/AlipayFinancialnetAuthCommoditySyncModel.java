package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 金融资源场景商品等数据同步
 *
 * @author auto create
 * @since 1.0, 2022-11-14 13:19:15
 */
public class AlipayFinancialnetAuthCommoditySyncModel extends AlipayObject {

	private static final long serialVersionUID = 2425375514732845388L;

	/**
	 * 同步商品信息
	 */
	@ApiListField("commodity_infos")
	@ApiField("commodity_info_list")
	private List<CommodityInfoList> commodityInfos;

	/**
	 * 幂等字段
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 平台标识
	 */
	@ApiField("platform_id")
	private String platformId;

	public List<CommodityInfoList> getCommodityInfos() {
		return this.commodityInfos;
	}
	public void setCommodityInfos(List<CommodityInfoList> commodityInfos) {
		this.commodityInfos = commodityInfos;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

}
