package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医疗药品商品修改接口
 *
 * @author auto create
 * @since 1.0, 2024-05-08 13:59:50
 */
public class AlipayCommerceMedicalMedicineItemModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1269579744752838344L;

	/**
	 * 指商户创建门店后支付宝生成的门店ID
	 */
	@ApiField("alipay_store_id")
	private String alipayStoreId;

	/**
	 * <a href="https://opendocs.alipay.com/mini/e2f9b4a2_alipay.open.app.delivery.info.sync?scene=common" target="_blank">alipay.open.app.delivery.info.sync</a>接口获取的履约模版id
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 医保支付标签
	 */
	@ApiField("insurance_flag")
	private String insuranceFlag;

	/**
	 * 支付宝平台侧商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品主图，通过图片文件上传接口<a href="https://opendocs.alipay.com/mini/3fade898_alipay.marketing.image.enhance.upload?scene=a07c8e4fcf3e490f97d959445f393b01&pathHash=a941a783" target="_blank">alipay.marketing.image.enhance.upload</a>上传图片后获取文件Id，白底、正方型、完整、组合包装正面
	 */
	@ApiField("main_image")
	private String mainImage;

	/**
	 * 商品的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 原价，单位分，例如传入101代表1.01元
	 */
	@ApiField("original_price")
	private Long originalPrice;

	/**
	 * 商品副图列表，通过图片文件上传接口<a href="https://opendocs.alipay.com/mini/3fade898_alipay.marketing.image.enhance.upload?scene=a07c8e4fcf3e490f97d959445f393b01&pathHash=a941a783" target="_blank">alipay.marketing.image.enhance.upload</a>上传图片后获取文件Id列表，白底、正方型、完整、组合包装正面
	 */
	@ApiListField("other_images")
	@ApiField("string")
	private List<String> otherImages;

	/**
	 * 外部唯一标识商品的id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 跳转商品详情的url
	 */
	@ApiField("path")
	private String path;

	/**
	 * 特价后的价格，单位分，例如传入100代表1元
	 */
	@ApiField("sale_price")
	private Long salePrice;

	/**
	 * 商品上下架状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	/**
	 * 商品库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

	/**
	 * 外部标品唯一标识
	 */
	@ApiField("upc")
	private String upc;

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getInsuranceFlag() {
		return this.insuranceFlag;
	}
	public void setInsuranceFlag(String insuranceFlag) {
		this.insuranceFlag = insuranceFlag;
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

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(Long originalPrice) {
		this.originalPrice = originalPrice;
	}

	public List<String> getOtherImages() {
		return this.otherImages;
	}
	public void setOtherImages(List<String> otherImages) {
		this.otherImages = otherImages;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public Long getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(Long salePrice) {
		this.salePrice = salePrice;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getUpc() {
		return this.upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}

}
