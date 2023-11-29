//Generated with EGF 1.6.4.202309111303
package org.polarsys.basic.requirement.doc.gen.content;

import org.eclipse.egf.common.helper.*;
import java.util.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.egf.model.pattern.*;
import org.eclipse.egf.pattern.execution.*;
import org.eclipse.egf.pattern.query.*;
import org.polarsys.capella.basic.requirement.Requirement;
import org.polarsys.capella.basic.requirement.helpers.RequirementModelHelper;
import org.polarsys.capella.docgen.util.StringUtil;
import org.polarsys.capella.basic.requirement.docgen.RequirementTreeServices;
import org.polarsys.capella.basic.requirement.docgen.helper.CapellaRequirementHelper;

public class CapellaElementRequirementsTemplate {
  protected static String nl;

  public static synchronized CapellaElementRequirementsTemplate create(String lineSeparator) {
    nl = lineSeparator;
    CapellaElementRequirementsTemplate result = new CapellaElementRequirementsTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t<h2>" + NL + "\tRequirements" + NL + "\t</h2>" + NL + "\t" + NL + "\t";
  protected final String TEXT_2 = NL + "\t<br>" + NL + "\t" + NL + "\t";
  protected final String TEXT_3 = NL + "\t" + NL + "\t";
  protected final String TEXT_4 = NL + "\t";
  protected final String TEXT_5 = NL;

  public CapellaElementRequirementsTemplate() {
    //Here is the constructor
    StringBuffer stringBuffer = new StringBuffer();

    // add initialisation of the pattern variables (declaration has been already done).

  }

  public String generate(Object argument) throws Exception {
    final StringBuffer stringBuffer = new StringBuffer();

    InternalPatternContext ctx = (InternalPatternContext) argument;
    Map<String, String> queryCtx = null;
    IQuery.ParameterDescription paramDesc = null;
    Node.Container currentNode = ctx.getNode();

    List<Object> documentTitleList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)
    List<Object> elementList = null;
    //this pattern can only be called by another (i.e. it's not an entry point in execution)

    for (Object documentTitleParameter : documentTitleList) {
      for (Object elementParameter : elementList) {

        this.documentTitle = (java.lang.String) documentTitleParameter;
        this.element = (org.polarsys.capella.core.data.capellacore.CapellaElement) elementParameter;

        if (preCondition(ctx)) {
          ctx.setNode(new Node.Container(currentNode, getClass()));
          orchestration(ctx);
        }

      }
    }
    ctx.setNode(currentNode);
    if (ctx.useReporter()) {
      ctx.getReporter().executionFinished(OutputManager.computeExecutionOutput(ctx), ctx);
    }

    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }

  public String orchestration(PatternContext ctx) throws Exception {
    InternalPatternContext ictx = (InternalPatternContext) ctx;

    method_body(new StringBuffer(), ictx);

    method_postBody(new StringBuffer(), ictx);

    if (ictx.useReporter()) {
      Map<String, Object> parameterValues = new HashMap<String, Object>();
      parameterValues.put("documentTitle", this.documentTitle);
      parameterValues.put("element", this.element);
      String outputWithCallBack = OutputManager.computeLoopOutput(ictx);
      String loop = OutputManager.computeLoopOutputWithoutCallback(ictx);
      ictx.getReporter().loopFinished(loop, outputWithCallBack, ictx, parameterValues);
    }
    return null;
  }

  protected java.lang.String documentTitle = null;

  public void set_documentTitle(java.lang.String object) {
    this.documentTitle = object;
  }

  protected org.polarsys.capella.core.data.capellacore.CapellaElement element = null;

  public void set_element(org.polarsys.capella.core.data.capellacore.CapellaElement object) {
    this.element = object;
  }

  public Map<String, Object> getParameters() {
    final Map<String, Object> parameters = new HashMap<String, Object>();
    parameters.put("documentTitle", this.documentTitle);
    parameters.put("element", this.element);
    return parameters;
  }

  protected void method_body(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    String projectName = ctx.getValue("projectName").toString();
    String outputFolder = ctx.getValue("outputFolder").toString();

    // requirements

    List<Requirement> appliedReq = RequirementModelHelper.getAppliedRequirements(element);
    if (appliedReq.size() > 0) {

      stringBuffer.append(TEXT_1);
      {
        //<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.doccontent.treeview.TreeViewControlHeader" args="element:parameter, RequirementTreeServices.REQUIREMENT_TREE_ID:treeID"%>

        InternalPatternContext ictx = (InternalPatternContext) ctx;
        new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
        stringBuffer.setLength(0);

        final Map<String, Object> callParameters = new HashMap<String, Object>();
        callParameters.put("parameter", element);
        callParameters.put("treeID", RequirementTreeServices.REQUIREMENT_TREE_ID);
        CallHelper.executeWithParameterInjection(
            "platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_V6ybEJ52EemYav3Xat9ApA",
            new ExecutionContext((InternalPatternContext) ctx), callParameters);
        stringBuffer.setLength(0);
      }

      stringBuffer.append(TEXT_2);
      stringBuffer.append(RequirementTreeServices.getRequirementsTree(appliedReq, projectName, outputFolder));
      stringBuffer.append(TEXT_3);
      {
        //<%@ egf:patternCall patternId="platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#LogicalName=org.polarsys.kitalpha.doc.gen.business.core.doccontent.treeview.TreeViewControlFooter" args="element:parameter, RequirementTreeServices.REQUIREMENT_TREE_ID:treeID, true:collapsed"%>

        InternalPatternContext ictx = (InternalPatternContext) ctx;
        new Node.DataLeaf(ictx.getNode(), getClass(), null, stringBuffer.toString());
        stringBuffer.setLength(0);

        final Map<String, Object> callParameters = new HashMap<String, Object>();
        callParameters.put("parameter", element);
        callParameters.put("treeID", RequirementTreeServices.REQUIREMENT_TREE_ID);
        callParameters.put("collapsed", true);
        CallHelper.executeWithParameterInjection(
            "platform:/plugin/org.polarsys.kitalpha.doc.gen.business.core/egf/HTMLDocGenCommon.fcore#_-tPnEJ8dEemYav3Xat9ApA",
            new ExecutionContext((InternalPatternContext) ctx), callParameters);
        stringBuffer.setLength(0);
      }

      stringBuffer.append(TEXT_4);

    }

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "body", stringBuffer.toString());
  }

  protected void method_postBody(final StringBuffer stringBuffer, final PatternContext ctx) throws Exception {

    InternalPatternContext ictx = (InternalPatternContext) ctx;
    new Node.DataLeaf(ictx.getNode(), getClass(), "postBody", stringBuffer.toString());
  }

  public boolean preCondition(PatternContext ctx) throws Exception {
    return true;
  }
}