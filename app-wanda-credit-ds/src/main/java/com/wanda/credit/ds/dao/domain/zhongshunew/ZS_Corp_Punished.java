package com.wanda.credit.ds.dao.domain.zhongshunew;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.GenericGenerator;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.wanda.credit.base.domain.BaseDomain;
@Entity(name="ZS_N_Corp_Punished")
@Table(name = "t_ds_zs_new_corp_punished")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer","order","id","updated","created","updatedby","createdby"})
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@XStreamAlias("punished")
public class ZS_Corp_Punished  extends BaseDomain {
	private static final long serialVersionUID = 1L;
	private String  Id;
	private String	TYPE          ;//新：
	private String	CARDNUMCLEAN  ;//新：
	
	private String	CASECODE      ;
	private String	INAMECLEAN    ;
	private String	SEXYCLEAN     ;
	private String 	AGECLEAN      ;
	private String	AREANAMECLEAN ;
	private String	YSFZD         ;
	private String	COURTNAME     ;
	private String 	REGDATECLEAN  ;
	private String	CASESTATE     ;
	private String	EXECMONEY     ;
	private String	FOCUSNUMBER   ;
	private String	ISRELATED   ;//是否关联被执行人 Y N|空
	private ZS_Order	ORDER ;
	/**
	 * 获取 主键
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(name = "ID", unique = true, nullable = false, length = 32)
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getCARDNUMCLEAN() {
		return CARDNUMCLEAN;
	}
	public void setCARDNUMCLEAN(String cARDNUMCLEAN) {
		CARDNUMCLEAN = cARDNUMCLEAN;
	}
	public String getCASECODE() {
		return CASECODE;
	}
	public void setCASECODE(String cASECODE) {
		CASECODE = cASECODE;
	}
	public String getINAMECLEAN() {
		return INAMECLEAN;
	}
	public void setINAMECLEAN(String iNAMECLEAN) {
		INAMECLEAN = iNAMECLEAN;
	}
	public String getSEXYCLEAN() {
		return SEXYCLEAN;
	}
	public void setSEXYCLEAN(String sEXYCLEAN) {
		SEXYCLEAN = sEXYCLEAN;
	}
	public String getAGECLEAN() {
		return AGECLEAN;
	}
	public void setAGECLEAN(String aGECLEAN) {
		AGECLEAN = aGECLEAN;
	}
	public String getAREANAMECLEAN() {
		return AREANAMECLEAN;
	}
	public void setAREANAMECLEAN(String aREANAMECLEAN) {
		AREANAMECLEAN = aREANAMECLEAN;
	}
	public String getYSFZD() {
		return YSFZD;
	}
	public void setYSFZD(String ySFZD) {
		YSFZD = ySFZD;
	}
	public String getCOURTNAME() {
		return COURTNAME;
	}
	public void setCOURTNAME(String cOURTNAME) {
		COURTNAME = cOURTNAME;
	}
	public String getREGDATECLEAN() {
		return REGDATECLEAN;
	}
	public void setREGDATECLEAN(String rEGDATECLEAN) {
		REGDATECLEAN = rEGDATECLEAN;
	}
	public String getCASESTATE() {
		return CASESTATE;
	}
	public void setCASESTATE(String cASESTATE) {
		CASESTATE = cASESTATE;
	}
	public String getEXECMONEY() {
		return EXECMONEY;
	}
	public void setEXECMONEY(String eXECMONEY) {
		EXECMONEY = eXECMONEY;
	}
	public String getFOCUSNUMBER() {
		return FOCUSNUMBER;
	}
	public void setFOCUSNUMBER(String fOCUSNUMBER) {
		FOCUSNUMBER = fOCUSNUMBER;
	}
	public String getISRELATED() {
		return ISRELATED;
	}
	public void setISRELATED(String iSRELATED) {
		ISRELATED = iSRELATED;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REFID")
	public ZS_Order getORDER() {
		return ORDER;
	}
	public void setORDER(ZS_Order oRDER) {
		ORDER = oRDER;
	}
}
