package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务插件扩展信息补充
 *
 * @author auto create
 * @since 1.0, 2018-03-16 17:31:50
 */
public class AlipayOpenServicemarketCommodityExtendinfosConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 1673111165839574576L;

	/**
	 * 公服BD审核扩展信息
	 */
	@ApiListField("commodity_ext_infos")
	@ApiField("commodity_ext_info_confirm")
	private List<CommodityExtInfoConfirm> commodityExtInfos;

	/**
	 * 服务Id
	 */
	@ApiField("commodity_id")
	private String commodityId;

	/**
	 * status 为驳回时 必须输入驳回原因
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 公服BD审核结果：成功还是失败:
status 【0：表示不通过 ， 1：表示通过】
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public List<CommodityExtInfoConfirm> getCommodityExtInfos() {
		return this.commodityExtInfos;
	}
	public void setCommodityExtInfos(List<CommodityExtInfoConfirm> commodityExtInfos) {
		this.commodityExtInfos = commodityExtInfos;
	}

	public String getCommodityId() {
		return this.commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
