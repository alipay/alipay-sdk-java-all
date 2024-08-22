package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IOT数据资源服务接口
 *
 * @author auto create
 * @since 1.0, 2021-09-17 10:26:53
 */
public class AlipayCommerceIotVendingmachineProfileQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1186641282537942426L;

	/**
	 * 设备唯一标识
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/**
	 * 商品code
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 商户pid
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 请求的数据资源类型组合，多组数据用',' 分隔；
可选类型（多选）：RECOMMEND_GOODS || NEARBY_CROWD_DENSITY || 
CONSUMER_PROFILE || 
MARKETING_DATA ||
	 */
	@ApiField("search_data_list")
	private String searchDataList;

	/**
	 * 请求数据维度，设备维度，商品维度，商家维度等；
可选枚举：
DEVICE || GOODS || MERCHANT
	 */
	@ApiField("search_data_type")
	private String searchDataType;

	/**
	 * 请求区间类型数据必传，如marketing_data_list；

拼接格式：起止时间_结束时间
	 */
	@ApiField("time_interval")
	private String timeInterval;

	public String getBizTid() {
		return this.bizTid;
	}
	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSearchDataList() {
		return this.searchDataList;
	}
	public void setSearchDataList(String searchDataList) {
		this.searchDataList = searchDataList;
	}

	public String getSearchDataType() {
		return this.searchDataType;
	}
	public void setSearchDataType(String searchDataType) {
		this.searchDataType = searchDataType;
	}

	public String getTimeInterval() {
		return this.timeInterval;
	}
	public void setTimeInterval(String timeInterval) {
		this.timeInterval = timeInterval;
	}

}
