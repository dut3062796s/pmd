/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.statement.MultiStatement;

public class ASTMultiStatement extends AbstractApexNode<MultiStatement> {

    public ASTMultiStatement(MultiStatement node) {
        super(node);
    }

    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
