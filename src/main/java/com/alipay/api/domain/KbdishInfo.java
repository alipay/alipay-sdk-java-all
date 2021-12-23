package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑的菜品模型,包含基本信息,sku,套餐明细
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:14:09
 */
public class KbdishInfo extends AlipayObject {

	private static final long serialVersionUID = 4351512799611659486L;

	/**
	 * 分类字典大类的id, 如果操作的是菜品，则比输入，如果操作的是sku信息，可不输入
	 */
	@ApiField("catetory_big_id")
	private String catetoryBigId;

	/**
	 * 小类,商家自定义配置表例如 肉，酒水，素菜
	 */
	@ApiField("catetory_small_id")
	private String catetorySmallId;

	/**
	 * 操作员
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 是否时价 Y:是 N否 目前口碑点餐暂不支持时价菜
	 */
	@ApiField("cur_price_flag")
	private String curPriceFlag;

	/**
	 * 是否开台必点菜 Y是  N否，默认否；暂废弃，后续针对开台菜提供新api
	 */
	@ApiField("default_in_carts")
	private String defaultInCarts;

	/**
	 * 开台菜点餐方式:如果是按数量点,直接输入数量例如2,；如果是按照就餐人数点，则输入countOnDiner这个固定的字符串
暂废弃，后续针对开台菜提供新api
	 */
	@ApiField("default_in_carts_detail")
	private String defaultInCartsDetail;

	/**
	 * 菜系,商家自定义
	 */
	@ApiField("dish_cuisine")
	private String dishCuisine;

	/**
	 * 菜品详情页图片id，展示在菜品详情页中；最多支持10张图片
	 */
	@ApiListField("dish_detail_img_list")
	@ApiField("string")
	private List<String> dishDetailImgList;

	/**
	 * 口碑的菜品id, 新增操作可以为空,修改的时候必传
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 商品图片，需要先调用素材的图片上传api得到图片id
	 */
	@ApiField("dish_img")
	private String dishImg;

	/**
	 * 菜品的名称
	 */
	@ApiField("dish_name")
	private String dishName;

	/**
	 * 做法加价列表
	 */
	@ApiListField("dish_practice_list")
	@ApiField("kbdish_practice_info")
	private List<KbdishPracticeInfo> dishPracticeList;

	/**
	 * 菜品sku列表
	 */
	@ApiListField("dish_sku_list")
	@ApiField("kbdish_sku_info")
	private List<KbdishSkuInfo> dishSkuList;

	/**
	 * 版本号 就是一个数据操作的时间戳
	 */
	@ApiField("dish_version")
	private String dishVersion;

	/**
	 * 拼音助记码
	 */
	@ApiField("en_remember_code")
	private String enRememberCode;

	/**
	 * 扩展字段,json串
	 */
	@ApiField("ext_content")
	private String extContent;

	/**
	 * 口碑的商品id,用于营销透传,可不传
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 菜品加料信息
	 */
	@ApiListField("material_binding_info_list")
	@ApiField("kbdish_material_binding_info")
	private List<KbdishMaterialBindingInfo> materialBindingInfoList;

	/**
	 * 商家id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 起点份数
	 */
	@ApiField("min_serving")
	private String minServing;

	/**
	 * 最小点菜数量, 用户点餐一次加多少,不填默认为1
	 */
	@ApiField("mini_add_num")
	private String miniAddNum;

	/**
	 * 数字助记码
	 */
	@ApiField("nb_remember_code")
	private String nbRememberCode;

	/**
	 * Y：不参与优惠计算  N: 参与优惠,不设置默认为N
	 */
	@ApiField("not_count_threshold")
	private String notCountThreshold;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 菜品销售属性，如辣度、加冰等，最多四个
	 */
	@ApiListField("property_info_list")
	@ApiField("kbdish_property_info")
	private List<KbdishPropertyInfo> propertyInfoList;

	/**
	 * 菜品的描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * 门店菜品id. 如果存门店菜品库，设置此值
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

	/**
	 * 菜品标签json串，key =spicy标示辣度, value=0标示不辣；1微辣；2中辣;3重辣。
key=special标识特色标签；value=0标示不设定;1招牌；2新品
	 */
	@ApiField("tags")
	private String tags;

	/**
	 * 口碑枚举定义 single:单品;packages：套餐
	 */
	@ApiField("type_big")
	private String typeBig;

	/**
	 * 小类,口碑枚举定义 fixed：固定套餐;choose:选N套餐 几选几
	 */
	@ApiField("type_small")
	private String typeSmall;

	/**
	 * 单位id 字典的id，数据来源接口为口碑菜品字典查询koubei.catering.dish.dictionary.query
	 */
	@ApiField("unit_id")
	private String unitId;

	/**
	 * 修改操作小二
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getCatetoryBigId() {
		return this.catetoryBigId;
	}
	public void setCatetoryBigId(String catetoryBigId) {
		this.catetoryBigId = catetoryBigId;
	}

	public String getCatetorySmallId() {
		return this.catetorySmallId;
	}
	public void setCatetorySmallId(String catetorySmallId) {
		this.catetorySmallId = catetorySmallId;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getCurPriceFlag() {
		return this.curPriceFlag;
	}
	public void setCurPriceFlag(String curPriceFlag) {
		this.curPriceFlag = curPriceFlag;
	}

	public String getDefaultInCarts() {
		return this.defaultInCarts;
	}
	public void setDefaultInCarts(String defaultInCarts) {
		this.defaultInCarts = defaultInCarts;
	}

	public String getDefaultInCartsDetail() {
		return this.defaultInCartsDetail;
	}
	public void setDefaultInCartsDetail(String defaultInCartsDetail) {
		this.defaultInCartsDetail = defaultInCartsDetail;
	}

	public String getDishCuisine() {
		return this.dishCuisine;
	}
	public void setDishCuisine(String dishCuisine) {
		this.dishCuisine = dishCuisine;
	}

	public List<String> getDishDetailImgList() {
		return this.dishDetailImgList;
	}
	public void setDishDetailImgList(List<String> dishDetailImgList) {
		this.dishDetailImgList = dishDetailImgList;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishImg() {
		return this.dishImg;
	}
	public void setDishImg(String dishImg) {
		this.dishImg = dishImg;
	}

	public String getDishName() {
		return this.dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public List<KbdishPracticeInfo> getDishPracticeList() {
		return this.dishPracticeList;
	}
	public void setDishPracticeList(List<KbdishPracticeInfo> dishPracticeList) {
		this.dishPracticeList = dishPracticeList;
	}

	public List<KbdishSkuInfo> getDishSkuList() {
		return this.dishSkuList;
	}
	public void setDishSkuList(List<KbdishSkuInfo> dishSkuList) {
		this.dishSkuList = dishSkuList;
	}

	public String getDishVersion() {
		return this.dishVersion;
	}
	public void setDishVersion(String dishVersion) {
		this.dishVersion = dishVersion;
	}

	public String getEnRememberCode() {
		return this.enRememberCode;
	}
	public void setEnRememberCode(String enRememberCode) {
		this.enRememberCode = enRememberCode;
	}

	public String getExtContent() {
		return this.extContent;
	}
	public void setExtContent(String extContent) {
		this.extContent = extContent;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public List<KbdishMaterialBindingInfo> getMaterialBindingInfoList() {
		return this.materialBindingInfoList;
	}
	public void setMaterialBindingInfoList(List<KbdishMaterialBindingInfo> materialBindingInfoList) {
		this.materialBindingInfoList = materialBindingInfoList;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMinServing() {
		return this.minServing;
	}
	public void setMinServing(String minServing) {
		this.minServing = minServing;
	}

	public String getMiniAddNum() {
		return this.miniAddNum;
	}
	public void setMiniAddNum(String miniAddNum) {
		this.miniAddNum = miniAddNum;
	}

	public String getNbRememberCode() {
		return this.nbRememberCode;
	}
	public void setNbRememberCode(String nbRememberCode) {
		this.nbRememberCode = nbRememberCode;
	}

	public String getNotCountThreshold() {
		return this.notCountThreshold;
	}
	public void setNotCountThreshold(String notCountThreshold) {
		this.notCountThreshold = notCountThreshold;
	}

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public List<KbdishPropertyInfo> getPropertyInfoList() {
		return this.propertyInfoList;
	}
	public void setPropertyInfoList(List<KbdishPropertyInfo> propertyInfoList) {
		this.propertyInfoList = propertyInfoList;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTags() {
		return this.tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTypeBig() {
		return this.typeBig;
	}
	public void setTypeBig(String typeBig) {
		this.typeBig = typeBig;
	}

	public String getTypeSmall() {
		return this.typeSmall;
	}
	public void setTypeSmall(String typeSmall) {
		this.typeSmall = typeSmall;
	}

	public String getUnitId() {
		return this.unitId;
	}
	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
