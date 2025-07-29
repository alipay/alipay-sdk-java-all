package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.regiongroup.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 19:51:46
 */
public class AnttechBlockchainDefinDataserviceRegiongroupMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 5467581748365169447L;

	/** 
	 * 匹配条件的区块分组编码列表
	 */
	@ApiListField("region_group_codes")
	@ApiField("string")
	private List<String> regionGroupCodes;

	/** 
	 * 玉米区块编组匹配数
	 */
	@ApiField("region_group_count_101")
	private Long regionGroupCount101;

	/** 
	 * 大豆区块编组匹配数
	 */
	@ApiField("region_group_count_115")
	private Long regionGroupCount115;

	/** 
	 * 水稻区块编组匹配数
	 */
	@ApiField("region_group_count_147")
	private Long regionGroupCount147;

	public void setRegionGroupCodes(List<String> regionGroupCodes) {
		this.regionGroupCodes = regionGroupCodes;
	}
	public List<String> getRegionGroupCodes( ) {
		return this.regionGroupCodes;
	}

	public void setRegionGroupCount101(Long regionGroupCount101) {
		this.regionGroupCount101 = regionGroupCount101;
	}
	public Long getRegionGroupCount101( ) {
		return this.regionGroupCount101;
	}

	public void setRegionGroupCount115(Long regionGroupCount115) {
		this.regionGroupCount115 = regionGroupCount115;
	}
	public Long getRegionGroupCount115( ) {
		return this.regionGroupCount115;
	}

	public void setRegionGroupCount147(Long regionGroupCount147) {
		this.regionGroupCount147 = regionGroupCount147;
	}
	public Long getRegionGroupCount147( ) {
		return this.regionGroupCount147;
	}

}
