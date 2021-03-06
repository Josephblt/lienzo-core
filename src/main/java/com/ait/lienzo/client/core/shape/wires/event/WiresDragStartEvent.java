/*
   Copyright (c) 2017 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.lienzo.client.core.shape.wires.event;

import com.ait.lienzo.client.core.event.AbstractNodeDragEvent;
import com.ait.lienzo.client.core.event.INodeXYEvent;
import com.ait.lienzo.client.core.shape.wires.WiresContainer;

/**
 * <p>Event that is fired when a wires container drag starts.</p>
 */
public class WiresDragStartEvent extends AbstractWiresDragEvent<WiresDragStartHandler> implements INodeXYEvent
{

    public static final Type<WiresDragStartHandler> TYPE = new Type<WiresDragStartHandler>();

    public WiresDragStartEvent(final WiresContainer shape, final AbstractNodeDragEvent<?> nodeDragEvent)
    {
        super(shape, nodeDragEvent);
    }

    @Override
    public Type<WiresDragStartHandler> getAssociatedType()
    {
        return TYPE;
    }

    @Override
    protected void dispatch(final WiresDragStartHandler shapeMovedHandler)
    {
        shapeMovedHandler.onShapeDragStart(this);
    }
}
