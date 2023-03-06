package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云智能应用上传数据接口
 *
 * @author auto create
 * @since 1.0, 2023-01-09 21:12:55
 */
public class TechriskInnovateMpcpromoDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8132315795243482791L;

	/**
	 * 商品数据的列表
	 */
	@ApiListField("data_list")
	@ApiField("mpcpromo_goods_list")
	private List<MpcpromoGoodsList> dataList;

	/**
	 * 数据类型
	 */
	@ApiField("date_type")
	private String dateType;

	/**
	 * 商户所在行业；normal （通用行业）
 leasing（租赁行业）、 travel（旅游行业）
	 */
	@ApiField("industry")
	private String industry;

	public List<MpcpromoGoodsList> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<MpcpromoGoodsList> dataList) {
		this.dataList = dataList;
	}

	public String getDateType() {
		return this.dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
