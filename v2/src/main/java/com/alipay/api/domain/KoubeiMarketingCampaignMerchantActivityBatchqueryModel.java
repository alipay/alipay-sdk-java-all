package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景化商家运营活动批量查询
 *
 * @author auto create
 * @since 1.0, 2022-06-27 11:31:12
 */
public class KoubeiMarketingCampaignMerchantActivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4536686891146732995L;

	/**
	 * 活动所属场景，只支持单个场景，目前支持枚举类型：点餐场景：DISH、预点餐场景：PRE_DISH、菜单场景：MENU
	 */
	@ApiListField("biz_scenes")
	@ApiField("string")
	private List<String> bizScenes;

	/**
	 * 外部请求号，控制幂等
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 分页查询页码page_num必须大于1的整数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询每页项数page_size不能超过范围1~100的整数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 门店Id
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<String> getBizScenes() {
		return this.bizScenes;
	}
	public void setBizScenes(List<String> bizScenes) {
		this.bizScenes = bizScenes;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
