package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppItemAttrVO;
import com.alipay.api.domain.LocalItemSkuQueryVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.localitem.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 17:41:49
 */
public class AlipayOpenAppLocalitemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2435229325714791154L;

	/** 
	 * 商品属性
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
	 * 商品主图，图片文件id，图片宽高为750px*750px，宽高比1:1。文件id通过alipay.open.file.upload上传资源获取。
	 */
	@ApiField("head_img")
	private String headImg;

	/** 
	 * 商品子图文件id列表，不超过 3 个图片，图片宽高为750px*750px，宽高比1:1。文件id通过alipay.open.file.upload上传资源获取。
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/** 
	 * 商品是否在线版本，true在线，false最新版本
	 */
	@ApiField("is_online")
	private Boolean isOnline;

	/** 
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化。
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 商品模版类型：
1. 团购套餐
2. 代金券
	 */
	@ApiField("item_type")
	private String itemType;

	/** 
	 * 商家侧商品ID，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/** 
	 * 商品详情页链接
	 */
	@ApiField("path")
	private String path;

	/** 
	 * sku数组
	 */
	@ApiListField("skus")
	@ApiField("local_item_sku_query_v_o")
	private List<LocalItemSkuQueryVO> skus;

	/** 
	 * 审核驳回：商品审核失败时，商品状态为审核驳回。 审核中：商品处于审核流程中时，商品状态为审核中。 已下架：商家可以通过调用接口下架商品，也可以通过商家后台下架商品。 可售卖：商家可以通过调用接口上架商品，也可以通过商家后台上架商品。 冻结：当商家出现违规操作时，支付宝侧将发起冻结，商品无法对外透出。 当商品包含多个规格时，只要有一个规格的商品状态为“可售卖”，商品状态则为“可售卖”。
	 */
	@ApiField("spu_status")
	private String spuStatus;

	/** 
	 * 库存
	 */
	@ApiField("stock_num")
	private String stockNum;

	/** 
	 * 商品名称，字符类型，最少不低于3，最长不超过60个字。注：1.商品标题只允许汉字、数字、英文字母、特殊字符集；2.商品标题不得仅为数字、字母、特殊字符集或上述三种的组合。
	 */
	@ApiField("title")
	private String title;

	/** 
	 * 商品最新更新时间
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

	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}
	public List<String> getImageList( ) {
		return this.imageList;
	}

	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}
	public Boolean getIsOnline( ) {
		return this.isOnline;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getItemType( ) {
		return this.itemType;
	}

	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}
	public String getOutItemId( ) {
		return this.outItemId;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getPath( ) {
		return this.path;
	}

	public void setSkus(List<LocalItemSkuQueryVO> skus) {
		this.skus = skus;
	}
	public List<LocalItemSkuQueryVO> getSkus( ) {
		return this.skus;
	}

	public void setSpuStatus(String spuStatus) {
		this.spuStatus = spuStatus;
	}
	public String getSpuStatus( ) {
		return this.spuStatus;
	}

	public void setStockNum(String stockNum) {
		this.stockNum = stockNum;
	}
	public String getStockNum( ) {
		return this.stockNum;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle( ) {
		return this.title;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getUpdateTime( ) {
		return this.updateTime;
	}

}
