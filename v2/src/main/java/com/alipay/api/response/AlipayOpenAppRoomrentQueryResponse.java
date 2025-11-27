package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AppItemAttrVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.roomrent.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-13 10:18:24
 */
public class AlipayOpenAppRoomrentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4363254834632948552L;

	/** 
	 * 通过alipay.open.app.localitem.template.query获取本地商品模板信息接口得到商品属性key，is_required=1时属性必填
	 */
	@ApiField("attrs")
	private AppItemAttrVO attrs;

	/** 
	 * 类目ID
	 */
	@ApiField("category_id")
	private String categoryId;

	/** 
	 * 商品创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 图片地址，展示在商品详情页的轮播图中，图片宽高为750px*750px，宽高比1:1，800kb以内。支持jpg、jpeg、png格式的图片。
	 */
	@ApiField("head_img")
	private String headImg;

	/** 
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 字符类型，最少不低于3，最长不超过60个字。注：1.商品标题只允许汉字、数字、英文字母、特殊字符集；2.商品标题不得仅为数字、字母、特殊字符集或上述三种的组合。
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 要求 APPID 下全局唯一
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/** 
	 * 审核驳回：商品审核失败时，商品状态为审核驳回。 审核中：商品处于审核流程中时，商品状态为审核中。 已下架：商家可以通过调用接口下架商品，也可以通过商家后台下架商品。 可售卖：商家可以通过调用接口上架商品，也可以通过商家后台上架商品。 冻结：当商家出现违规操作时，支付宝侧将发起冻结，商品无法对外透出。 当商品包含多个规格时，只要有一个规格的商品状态为“可售卖”，spu的商品状态则为“可售卖”。
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/** 
	 * 商品更新时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	public void setAttrs(AppItemAttrVO attrs) {
		this.attrs = attrs;
	}
	public AppItemAttrVO getAttrs( ) {
		return this.attrs;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public String getHeadImg( ) {
		return this.headImg;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}
	public String getOutItemId( ) {
		return this.outItemId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}
	public Long getStockNum( ) {
		return this.stockNum;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getUpdateTime( ) {
		return this.updateTime;
	}

}
