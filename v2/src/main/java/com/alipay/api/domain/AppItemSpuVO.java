package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品spu模型
 *
 * @author auto create
 * @since 1.0, 2023-03-14 15:11:35
 */
public class AppItemSpuVO extends AlipayObject {

	private static final long serialVersionUID = 6278467677439479875L;

	/**
	 * 商品条形码信息
	 */
	@ApiField("bar_code_info")
	private BarcodeInfo barCodeInfo;

	/**
	 * 商品类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 导购标题
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 商品子图 URL 列表，不超过 3 个图片，图片宽度及宽高比，建议值：图片宽度必须大于 750px，宽高比建议 4:3 - 1:1 之间
	 */
	@ApiListField("image_list")
	@ApiField("string")
	private List<String> imageList;

	/**
	 * 商家侧spu商品 ID，要求 APPID 下全局唯一
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品主图，图片宽度及宽高比，建议值：图片宽度必须大于 750px，宽高比建议 4:3 - 1:1 之间，最大长度 128。
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 平台侧商品id
	 */
	@ApiField("platform_item_id")
	private String platformItemId;

	/**
	 * 商品价格
	 */
	@ApiField("price")
	private AppItemSPUPriceVO price;

	/**
	 * 审核驳回：商品审核失败时，商品状态为审核驳回。 审核中：商品处于审核流程中时，商品状态为审核中。 已下架：商家可以通过调用接口下架商品，也可以通过商家后台下架商品。 可售卖：商家可以通过调用接口上架商品，也可以通过商家后台上架商品。 冻结：当商家出现违规操作时，支付宝侧将发起冻结，商品无法对外透出。 当商品包含多个规格时，只要有一个规格的商品状态为“可售卖”，spu的商品状态则为“可售卖”。
	 */
	@ApiField("spu_status")
	private String spuStatus;

	/**
	 * 商品spu库存信息
	 */
	@ApiField("spu_stock")
	private SpuStock spuStock;

	/**
	 * 商品详情页URL
	 */
	@ApiField("src_path")
	private String srcPath;

	/**
	 * 商品名称
	 */
	@ApiField("title")
	private String title;

	public BarcodeInfo getBarCodeInfo() {
		return this.barCodeInfo;
	}
	public void setBarCodeInfo(BarcodeInfo barCodeInfo) {
		this.barCodeInfo = barCodeInfo;
	}

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<String> getImageList() {
		return this.imageList;
	}
	public void setImageList(List<String> imageList) {
		this.imageList = imageList;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getMainImage() {
		return this.mainImage;
	}
	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public String getPlatformItemId() {
		return this.platformItemId;
	}
	public void setPlatformItemId(String platformItemId) {
		this.platformItemId = platformItemId;
	}

	public AppItemSPUPriceVO getPrice() {
		return this.price;
	}
	public void setPrice(AppItemSPUPriceVO price) {
		this.price = price;
	}

	public String getSpuStatus() {
		return this.spuStatus;
	}
	public void setSpuStatus(String spuStatus) {
		this.spuStatus = spuStatus;
	}

	public SpuStock getSpuStock() {
		return this.spuStock;
	}
	public void setSpuStock(SpuStock spuStock) {
		this.spuStock = spuStock;
	}

	public String getSrcPath() {
		return this.srcPath;
	}
	public void setSrcPath(String srcPath) {
		this.srcPath = srcPath;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
