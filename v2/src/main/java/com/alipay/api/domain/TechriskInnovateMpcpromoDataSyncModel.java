package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云智能应用上传数据接口
 *
 * @author auto create
 * @since 1.0, 2023-07-13 09:41:51
 */
public class TechriskInnovateMpcpromoDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8251232552349665258L;

	/**
	 * 商品数据的列表
	 */
	@ApiListField("data_list")
	@ApiField("mpcpromo_goods_list")
	private List<MpcpromoGoodsList> dataList;

	/**
	 * 数据类型 : USER（用户数据）、ITEM（商品数据）
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 行业类别:   goodsLease（常规/租赁 商品数据）
	 */
	@ApiField("industry")
	private String industry;

	public List<MpcpromoGoodsList> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<MpcpromoGoodsList> dataList) {
		this.dataList = dataList;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
