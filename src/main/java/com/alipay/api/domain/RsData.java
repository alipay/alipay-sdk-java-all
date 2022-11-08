package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Nimitz RsData
 *
 * @author auto create
 * @since 1.0, 2022-06-13 16:55:25
 */
public class RsData extends AlipayObject {

	private static final long serialVersionUID = 5686591474317299729L;

	/**
	 * Nimitz 数据表
	 */
	@ApiField("data")
	private NimitzTable data;

	/**
	 * table 型数据集
	 */
	@ApiField("rs_dataset")
	private String rsDataset;

	public NimitzTable getData() {
		return this.data;
	}
	public void setData(NimitzTable data) {
		this.data = data;
	}

	public String getRsDataset() {
		return this.rsDataset;
	}
	public void setRsDataset(String rsDataset) {
		this.rsDataset = rsDataset;
	}

}
