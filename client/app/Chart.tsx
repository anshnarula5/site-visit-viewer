import React from 'react'
import HeatMap from '@uiw/react-heat-map';

const Chart = ({ data }: any) => {
    return (
            <HeatMap
                space={3}
                key={Math.random()}
                value={data}
                rectSize ={3}
                weekLabels={['', 'Mon', '', 'Wed', '', 'Fri', '']}
                monthLabels={['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']}
                startDate={new Date('2023/01/01')}
                endDate = {new Date('2023/12/31')}
            />
    )
}

export default Chart