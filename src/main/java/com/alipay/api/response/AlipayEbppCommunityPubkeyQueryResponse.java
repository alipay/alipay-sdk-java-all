package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccessPublicKey;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.community.pubkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-09 14:34:26
 */
public class AlipayEbppCommunityPubkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2421552489294166919L;

	/** 
	 * 公钥json的md5值，若与上次相同则无需更新到机具
	 */
	@ApiField("e_tag")
	private String eTag;

	/** 
	 * 公钥列表，isv无需理解内容，需转化成json字符串保存进机具。
可自定义机具中的文件路径，默认使用和sdk的同级目录的文件，文件名为pubkey.txt
	 */
	@ApiListField("pubkey_list")
	@ApiField("access_public_key")
	private List<AccessPublicKey> pubkeyList;

	public void seteTag(String eTag) {
		this.eTag = eTag;
	}
	public String geteTag( ) {
		return this.eTag;
	}

	public void setPubkeyList(List<AccessPublicKey> pubkeyList) {
		this.pubkeyList = pubkeyList;
	}
	public List<AccessPublicKey> getPubkeyList( ) {
		return this.pubkeyList;
	}

}
