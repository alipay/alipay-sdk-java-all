package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品消息内容模型，当消息类型(msg_type)选 "GOODS" 的时候，这个内容必须得填充
 *
 * @author auto create
 * @since 1.0, 2025-05-30 14:58:13
 */
public class GoodsMsgVO extends AlipayObject {

	private static final long serialVersionUID = 3723299338963177238L;

	/**
	 * 多个商品投放类型支持优惠券
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 自定义来源时必填,最多配置5个商品
	 */
	@ApiListField("custom_goods_list")
	@ApiField("custom_goods_v_o")
	private List<CustomGoodsVO> customGoodsList;

	/**
	 * 对推送商品的简单介绍（参考：美妆好物应有尽有，快戳进来看看呀）
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 单商品投放类型时必填
商品Id。传入商品id后可支持在群内发商品消息。
	 */
	@ApiField("goods_item_id")
	private String goodsItemId;

	/**
	 * 多商品投放类型且商品库来源时必填,最多配置5个商品
商品Id。传入商品id后可支持在群内发商品消息。
	 */
	@ApiListField("goods_item_id_list")
	@ApiField("string")
	private List<String> goodsItemIdList;

	/**
	 * 商品库：goodsStore；自定义：custom
若选择自定义来源,自定义商品列表必填
若选择商品库来源,多哥商品投放时,平台侧商品ID列表必填;单个商品投放时,平台侧商品ID必填
	 */
	@ApiField("goods_source")
	private String goodsSource;

	/**
	 * 单个商品：false；多个商品：true
多个商品投放类型支持自定义商品和优惠券，单个商品投放类型不支持自定义商品和优惠券
	 */
	@ApiField("multi_goods")
	private Boolean multiGoods;

	/**
	 * 小程序应用id，商品库来源时必填
	 */
	@ApiField("related_app_id")
	private String relatedAppId;

	/**
	 * 推送的消息文案标题（参考：好物分享来咯！）
	 */
	@ApiField("title")
	private String title;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<CustomGoodsVO> getCustomGoodsList() {
		return this.customGoodsList;
	}
	public void setCustomGoodsList(List<CustomGoodsVO> customGoodsList) {
		this.customGoodsList = customGoodsList;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getGoodsItemId() {
		return this.goodsItemId;
	}
	public void setGoodsItemId(String goodsItemId) {
		this.goodsItemId = goodsItemId;
	}

	public List<String> getGoodsItemIdList() {
		return this.goodsItemIdList;
	}
	public void setGoodsItemIdList(List<String> goodsItemIdList) {
		this.goodsItemIdList = goodsItemIdList;
	}

	public String getGoodsSource() {
		return this.goodsSource;
	}
	public void setGoodsSource(String goodsSource) {
		this.goodsSource = goodsSource;
	}

	public Boolean getMultiGoods() {
		return this.multiGoods;
	}
	public void setMultiGoods(Boolean multiGoods) {
		this.multiGoods = multiGoods;
	}

	public String getRelatedAppId() {
		return this.relatedAppId;
	}
	public void setRelatedAppId(String relatedAppId) {
		this.relatedAppId = relatedAppId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
