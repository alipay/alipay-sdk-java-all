package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询药品操作记录接口
 *
 * @author auto create
 * @since 1.0, 2023-06-20 17:51:47
 */
public class AlipayInsSceneInshealthserviceprodItemoperationrecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1383796571588167536L;

	/**
	 * 支付宝的服务产品编号
	 */
	@ApiField("ant_ser_prod_no")
	private String antSerProdNo;

	/**
	 * 触发时间 end
	 */
	@ApiField("init_time_end")
	private Date initTimeEnd;

	/**
	 * 触发时间 start
	 */
	@ApiField("init_time_start")
	private Date initTimeStart;

	/**
	 * 机构商品编码
	 */
	@ApiField("merchant_item_code")
	private String merchantItemCode;

	/**
	 * 页码，默认为 1
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 页面大小，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 药品操作类型列表。MAJOR 主要信息;EXT 扩展信息;UP 上架;DOWN 下架商品
	 */
	@ApiListField("refresh_type_list")
	@ApiField("string")
	private List<String> refreshTypeList;

	/**
	 * 状态列表。
PROCESSING  执行中，
SUCCESS 成功，
FAIL 执行失败
	 */
	@ApiListField("status_list")
	@ApiField("string")
	private List<String> statusList;

	public String getAntSerProdNo() {
		return this.antSerProdNo;
	}
	public void setAntSerProdNo(String antSerProdNo) {
		this.antSerProdNo = antSerProdNo;
	}

	public Date getInitTimeEnd() {
		return this.initTimeEnd;
	}
	public void setInitTimeEnd(Date initTimeEnd) {
		this.initTimeEnd = initTimeEnd;
	}

	public Date getInitTimeStart() {
		return this.initTimeStart;
	}
	public void setInitTimeStart(Date initTimeStart) {
		this.initTimeStart = initTimeStart;
	}

	public String getMerchantItemCode() {
		return this.merchantItemCode;
	}
	public void setMerchantItemCode(String merchantItemCode) {
		this.merchantItemCode = merchantItemCode;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getRefreshTypeList() {
		return this.refreshTypeList;
	}
	public void setRefreshTypeList(List<String> refreshTypeList) {
		this.refreshTypeList = refreshTypeList;
	}

	public List<String> getStatusList() {
		return this.statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}

}
