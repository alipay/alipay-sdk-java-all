package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 端外应用查询订单核销记录
 *
 * @author auto create
 * @since 1.0, 2026-04-17 10:19:13
 */
public class AlipayOpenAppOrdermanagerCertificateuseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8785355823152375372L;

	/**
	 * 商家在支付宝平台内创建的一种营销业务的载体，可以支持发品、配券以及活动报名的id,它的来源是SAAS服务商来进件的时候,创建团购店铺的时候,生成的。
	 */
	@ApiField("a_store_id")
	private String aStoreId;

	/**
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 需传入商家在支付宝侧生成的店铺id 当前字段已废弃(店铺id字段请使用a_store_id，与商品、店铺保持一致)
	 */
	@ApiField("store_id")
	@Deprecated
	private String storeId;

	/**
	 * 核销时间右区间，时间戳格式，查询时会包含本字段表示的时间
	 */
	@ApiField("write_off_end")
	private Long writeOffEnd;

	/**
	 * 待查询的核销团购门店id列表
	 */
	@ApiListField("write_off_shop_ids")
	@ApiField("string")
	private List<String> writeOffShopIds;

	/**
	 * 核销时间左区间，时间戳格式，查询时间范围会包含本字段对应的时间
	 */
	@ApiField("write_off_start")
	private Long writeOffStart;

	/**
	 * 核销状态
	 */
	@ApiField("write_off_status")
	private String writeOffStatus;

	public String getaStoreId() {
		return this.aStoreId;
	}
	public void setaStoreId(String aStoreId) {
		this.aStoreId = aStoreId;
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

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Long getWriteOffEnd() {
		return this.writeOffEnd;
	}
	public void setWriteOffEnd(Long writeOffEnd) {
		this.writeOffEnd = writeOffEnd;
	}

	public List<String> getWriteOffShopIds() {
		return this.writeOffShopIds;
	}
	public void setWriteOffShopIds(List<String> writeOffShopIds) {
		this.writeOffShopIds = writeOffShopIds;
	}

	public Long getWriteOffStart() {
		return this.writeOffStart;
	}
	public void setWriteOffStart(Long writeOffStart) {
		this.writeOffStart = writeOffStart;
	}

	public String getWriteOffStatus() {
		return this.writeOffStatus;
	}
	public void setWriteOffStatus(String writeOffStatus) {
		this.writeOffStatus = writeOffStatus;
	}

}
