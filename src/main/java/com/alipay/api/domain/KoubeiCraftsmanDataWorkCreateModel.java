package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手艺人作品发布接口
 *
 * @author auto create
 * @since 1.0, 2017-10-11 20:36:00
 */
public class KoubeiCraftsmanDataWorkCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3287655474122772625L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为《koubei.member.data.oauth.query》中的auth_code，默认有效期24小时；isv自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 口碑手艺人id。是创建手艺人接口koubei.craftsman.data.provider.create返回的craftsman_id，或通过查询手艺人信息接口koubei.craftsman.data.provider查询craftsman_id
	 */
	@ApiField("craftsman_id")
	private String craftsmanId;

	/**
	 * 作品所属门店id列表。可通过批量查询手艺人信息接口koubei.craftsman.data.provider.batchquery，查询手艺人所属的门店的shop_id。
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 作品列表
	 */
	@ApiListField("works")
	@ApiField("craftsman_work_create_open_model")
	private List<CraftsmanWorkCreateOpenModel> works;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getCraftsmanId() {
		return this.craftsmanId;
	}
	public void setCraftsmanId(String craftsmanId) {
		this.craftsmanId = craftsmanId;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public List<CraftsmanWorkCreateOpenModel> getWorks() {
		return this.works;
	}
	public void setWorks(List<CraftsmanWorkCreateOpenModel> works) {
		this.works = works;
	}

}
