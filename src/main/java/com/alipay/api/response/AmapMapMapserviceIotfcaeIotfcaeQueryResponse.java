package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: amap.map.mapservice.iotfcae.iotfcae.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-04 18:19:34
 */
public class AmapMapMapserviceIotfcaeIotfcaeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6319558187344575968L;

	/** 
	 * 证件号
	 */
	@ApiField("cert_no")
	private String certNo;

	/** 
	 * dkjkvgfdugdfugh
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/** 
	 * vgdfskvghdflgjdfkf
	 */
	@ApiField("expire_date")
	private String expireDate;

	/** 
	 * vfsvgdfghdf
	 */
	@ApiField("name")
	private String name;

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo( ) {
		return this.certNo;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}
	public List<String> getDataList( ) {
		return this.dataList;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getExpireDate( ) {
		return this.expireDate;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
