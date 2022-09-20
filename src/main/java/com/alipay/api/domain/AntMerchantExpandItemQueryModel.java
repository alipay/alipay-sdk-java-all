package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品查询接口
 *
 * @author auto create
 * @since 1.0, 2021-02-19 14:31:40
 */
public class AntMerchantExpandItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1242964719716751371L;

	/**
	 * 商品前台类目id: null 表示所有分类
	 */
	@ApiField("front_category_id")
	private String frontCategoryId;

	/**
	 * 商品状态：EFFECT、INVALID、PAUSE；不填返回所有状态商品
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品归属主体id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型:
5: 店铺
4: 主站MID
3: 参与者
2: 角色
1: 联系人
	 */
	@ApiField("target_type")
	private String targetType;

	/**
	 * 未分类类目: true 的时候 front_category_id 必须不填（null）
	 */
	@ApiField("undefined_category")
	private Boolean undefinedCategory;

	public String getFrontCategoryId() {
		return this.frontCategoryId;
	}
	public void setFrontCategoryId(String frontCategoryId) {
		this.frontCategoryId = frontCategoryId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public Boolean getUndefinedCategory() {
		return this.undefinedCategory;
	}
	public void setUndefinedCategory(Boolean undefinedCategory) {
		this.undefinedCategory = undefinedCategory;
	}

}
