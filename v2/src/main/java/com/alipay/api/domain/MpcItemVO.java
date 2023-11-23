package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云营销商品数据回填结构
 *
 * @author auto create
 * @since 1.0, 2023-09-21 16:27:42
 */
public class MpcItemVO extends AlipayObject {

	private static final long serialVersionUID = 6213788756399563461L;

	/**
	 * 支付商品类目
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 1=官方插件版;0=自定义详情页版
	 */
	@ApiField("detail_page_model")
	private String detailPageModel;

	/**
	 * 副图
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 商品主图链接
	 */
	@ApiField("main_pic")
	private String mainPic;

	/**
	 * 小程序云营销商品id
	 */
	@ApiField("mpc_item_id")
	private String mpcItemId;

	/**
	 * 小程序智能营销sku信息
	 */
	@ApiListField("mpc_sku_vo")
	@ApiField("mpc_sku_v_o")
	private List<MpcSkuVO> mpcSkuVo;

	/**
	 * 商家商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品详情页URL
	 */
	@ApiField("path")
	private String path;

	/**
	 * 价格
	 */
	@ApiField("price")
	private String price;

	/**
	 * 商品标题
	 */
	@ApiField("title")
	private String title;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDetailPageModel() {
		return this.detailPageModel;
	}
	public void setDetailPageModel(String detailPageModel) {
		this.detailPageModel = detailPageModel;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getMainPic() {
		return this.mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}

	public String getMpcItemId() {
		return this.mpcItemId;
	}
	public void setMpcItemId(String mpcItemId) {
		this.mpcItemId = mpcItemId;
	}

	public List<MpcSkuVO> getMpcSkuVo() {
		return this.mpcSkuVo;
	}
	public void setMpcSkuVo(List<MpcSkuVO> mpcSkuVo) {
		this.mpcSkuVo = mpcSkuVo;
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

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
