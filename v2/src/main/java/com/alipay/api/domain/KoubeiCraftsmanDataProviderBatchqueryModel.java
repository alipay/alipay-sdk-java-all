package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 手艺人信息批量查询接口
 *
 * @author auto create
 * @since 1.0, 2022-11-22 14:58:10
 */
public class KoubeiCraftsmanDataProviderBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4163733833952357926L;

	/**
	 * 服务商、服务商员工、商户、商户员工等口碑角色操作时必填，对应为 koubei.member.data.oauth.query 中的 auth_code，默认有效期24小时；ISV自身角色操作的时候，无需传该参数
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 手艺人id (如果传入craftsman_ids，会忽略其他参数：注意，不能与shop_id同时为空),以数组方式传值
	 */
	@ApiListField("craftsman_ids")
	@ApiField("string")
	private List<String> craftsmanIds;

	/**
	 * 手艺人外部id（如果没有传craftsman_ids，传了craftsman_external_ids，会忽略其他参数，注意，不能与shop_id 同时为空）
	 */
	@ApiListField("out_craftsman_ids")
	@ApiField("string")
	private List<String> outCraftsmanIds;

	/**
	 * 页码，大于0，最大为int的最大值
	 */
	@ApiField("page_no")
	private String pageNo;

	/**
	 * 每页的条数，大于0，最大不超过100条
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 手艺人码对应的门店，只有指定了码门店字段，才会返回手艺人码信息
	 */
	@ApiField("qr_code_shop_id")
	private String qrCodeShopId;

	/**
	 * 是否推荐 (true 返回在c端展示的手艺人，false 返回c端隐藏的手艺人，不传表示不过滤）
	 */
	@ApiField("recommend")
	private Boolean recommend;

	/**
	 * 口碑门店id（不能与craftsman_ids和out_craftsman_ids同时为空）
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public List<String> getCraftsmanIds() {
		return this.craftsmanIds;
	}
	public void setCraftsmanIds(List<String> craftsmanIds) {
		this.craftsmanIds = craftsmanIds;
	}

	public List<String> getOutCraftsmanIds() {
		return this.outCraftsmanIds;
	}
	public void setOutCraftsmanIds(List<String> outCraftsmanIds) {
		this.outCraftsmanIds = outCraftsmanIds;
	}

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getQrCodeShopId() {
		return this.qrCodeShopId;
	}
	public void setQrCodeShopId(String qrCodeShopId) {
		this.qrCodeShopId = qrCodeShopId;
	}

	public Boolean getRecommend() {
		return this.recommend;
	}
	public void setRecommend(Boolean recommend) {
		this.recommend = recommend;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
