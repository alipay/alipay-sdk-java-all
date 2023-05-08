package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云智能应用上传数据接口
 *
 * @author auto create
 * @since 1.0, 2023-03-22 16:39:50
 */
public class TechriskInnovateMpcpromoDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5884329591693644631L;

	/**
	 * 商品数据的列表
	 */
	@ApiListField("data_list")
	@ApiField("mpcpromo_goods_list")
	private List<MpcpromoGoodsList> dataList;

	/**
	 * 数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 商户所在行业:  goodsNormal（通用行业商品数据）
 goodsLease（租赁行业商品数据）
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
