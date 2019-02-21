package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品库加料模型
 *
 * @author auto create
 * @since 1.0, 2019-01-08 15:32:45
 */
public class KbdishMaterialInfo extends AlipayObject {

	private static final long serialVersionUID = 6886887367153631196L;

	/**
	 * 加价金额，最小加价金额0
	 */
	@ApiField("add_price")
	private String addPrice;

	/**
	 * 创建人，在新增时必传
	 */
	@ApiField("create_user")
	private String createUser;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 加料id，加料的唯一标识。
新增时该项不用传，修改删除时必传。
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 口碑的加料图片id
	 */
	@ApiField("material_img")
	private String materialImg;

	/**
	 * 加料的名称
	 */
	@ApiField("material_name")
	private String materialName;

	/**
	 * SHOP/PID。代表加料类型是门店或者商户。
	 */
	@ApiField("material_type")
	private String materialType;

	/**
	 * 表示单个菜品加料最多可以加料的份数
	 */
	@ApiField("max_num")
	private String maxNum;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 公共字段，根据materialType的类型，这里填入商户id或者口碑门店id。
	 */
	@ApiField("public_id")
	private String publicId;

	/**
	 * 修改人，在新增和修改，删除时必传
	 */
	@ApiField("update_user")
	private String updateUser;

	public String getAddPrice() {
		return this.addPrice;
	}
	public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
	}

	public String getCreateUser() {
		return this.createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMaterialImg() {
		return this.materialImg;
	}
	public void setMaterialImg(String materialImg) {
		this.materialImg = materialImg;
	}

	public String getMaterialName() {
		return this.materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getMaterialType() {
		return this.materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getMaxNum() {
		return this.maxNum;
	}
	public void setMaxNum(String maxNum) {
		this.maxNum = maxNum;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPublicId() {
		return this.publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

}
