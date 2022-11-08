package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 快消百万小店商家单品活动库存增加接口
 *
 * @author auto create
 * @since 1.0, 2022-05-09 13:23:16
 */
public class AlipayCommerceOperationBrandsolutionGoodsstockAddModel extends AlipayObject {

	private static final long serialVersionUID = 2331491331556716621L;

	/**
	 * 活动唯一标识
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商家活动库存修改列表，允许批量修改，单次最多修改10条
	 */
	@ApiListField("merchant_activity_goods_increase_stock")
	@ApiField("merchant_activity_goods_stock_increase")
	private List<MerchantActivityGoodsStockIncrease> merchantActivityGoodsIncreaseStock;

	/**
	 * 外部业务号，幂等使用
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<MerchantActivityGoodsStockIncrease> getMerchantActivityGoodsIncreaseStock() {
		return this.merchantActivityGoodsIncreaseStock;
	}
	public void setMerchantActivityGoodsIncreaseStock(List<MerchantActivityGoodsStockIncrease> merchantActivityGoodsIncreaseStock) {
		this.merchantActivityGoodsIncreaseStock = merchantActivityGoodsIncreaseStock;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
