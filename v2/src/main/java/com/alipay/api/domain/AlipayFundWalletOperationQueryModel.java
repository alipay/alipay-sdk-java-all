package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 钱包操作流水查询
 *
 * @author auto create
 * @since 1.0, 2023-12-04 11:40:18
 */
public class AlipayFundWalletOperationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2197814126468179969L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 业务类型
	 */
	@ApiListField("biz_types")
	@ApiField("string")
	private List<String> bizTypes;

	/**
	 * 当前页
	 */
	@ApiField("current_page")
	private String currentPage;

	/**
	 * 业务结束时间
	 */
	@ApiField("end_biz_dt")
	private String endBizDt;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 业务起始时间
	 */
	@ApiField("start_biz_dt")
	private String startBizDt;

	/**
	 * 用户钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public List<String> getBizTypes() {
		return this.bizTypes;
	}
	public void setBizTypes(List<String> bizTypes) {
		this.bizTypes = bizTypes;
	}

	public String getCurrentPage() {
		return this.currentPage;
	}
	public void setCurrentPage(String currentPage) {
		this.currentPage = currentPage;
	}

	public String getEndBizDt() {
		return this.endBizDt;
	}
	public void setEndBizDt(String endBizDt) {
		this.endBizDt = endBizDt;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStartBizDt() {
		return this.startBizDt;
	}
	public void setStartBizDt(String startBizDt) {
		this.startBizDt = startBizDt;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
