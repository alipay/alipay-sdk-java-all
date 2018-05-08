package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑的菜品模型  包含基本信息 suku 套餐明细
 *
 * @author auto create
 * @since 1.0, 2018-03-20 16:49:12
 */
public class KbdishInfo extends AlipayObject {

	private static final long serialVersionUID = 7638595536886539229L;

	/**
	 * 分类字典大类的id
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
	 * 是否是价 Y:是 N否
	 */
	@ApiField("cur_price_flag")
	private String curPriceFlag;

	/**
	 * 菜系,商家自定义
	 */
	@ApiField("dish_cuisine")
	private String dishCuisine;

	/**
	 * 口碑的菜品id,新增的时候可以为空
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
	 * 口碑的商品id,用于营销透传
	 */
	@ApiField("goods_id")
	private String goodsId;

	/**
	 * 商家id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 起点分数
	 */
	@ApiField("min_serving")
	private String minServing;

	/**
	 * 数字助记码
	 */
	@ApiField("nb_remember_code")
	private String nbRememberCode;

	/**
	 * 菜品的描述
	 */
	@ApiField("remarks")
	private String remarks;

	/**
	 * open 启动 stop 停用
	 */
	@ApiField("status")
	private String status;

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
	 * 单位id 字典的id
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

	public String getDishCuisine() {
		return this.dishCuisine;
	}
	public void setDishCuisine(String dishCuisine) {
		this.dishCuisine = dishCuisine;
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

	public String getNbRememberCode() {
		return this.nbRememberCode;
	}
	public void setNbRememberCode(String nbRememberCode) {
		this.nbRememberCode = nbRememberCode;
	}

	public String getRemarks() {
		return this.remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
